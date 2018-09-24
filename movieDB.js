var https = require('https');

function extractMoviesData(substring) {
    currentPageNumber = 1;
    let url = 'https://jsonmock.hackerrank.com/api/movies/search/?Title=' + substring + "&page=" + currentPageNumber;
    https.get(url, (result) => {
        result.setEncoding('utf8');
        result.on('data', function(body) {
            let dataRecord = JSON.parse(body);
            let movies = dataRecord.data;
            let totalPages = dataRecord.total_pages;
            let sortMoviesArray = [];
            movies.map((movie) => {
                sortMoviesArray.push(movie.Title);
            });
            for (let i = 2; i <= totalPages; i++) {
                let newPage = i;
                let url1 = 'https://jsonmock.hackerrank.com/api/movies/search/?Title=' + substring + "&page=" + newPage;
                https.get(url1, (result) => {
                    result.setEncoding('utf8');
                    result.on('data', function(body) {
                        let newData = JSON.parse(body);
                        let newMovies = newData.data;
                        for (let i = 0; i < newMovies.length; i++) {
                            sortMoviesArray.push(newMovies[i].Title);
                        }
                        console.log(sortMoviesArray.sort());
                    })
                })
            }
        })
    })
}

//primary function
function getMoviesTitles(substring) {
    extractMoviesData(substring);
}

getMoviesTitles("spiderman");