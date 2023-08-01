import React from "react";


class StudioGhibliComponent extends React.Component {

    state = {
        movies: []
    }

    componentDidMount() {
        fetch('https://ghibliapi.vercel.app/films')
            .then(response => response.json())
            .then(moviesList => {
                // Process the returned data
                this.setState({ movies: moviesList });
                console.log(moviesList);
            })
            .catch(error => {
                // Handle any errors
                console.error(error);
            });
    }

    render() {
        return (

            <div className="filmContainer mt-3">
                {this.state.movies.map((movie) => (
                    <>
                        <div className="card cardWidth" key={movie.id}>
                            <img
                                alt={`${movie.title} poster`}
                                src={movie.image}
                                className="card-img-top"
                            />
                            <div className="card-body">
                                <h4 className="card-title">{movie.title}</h4>
                                <p className="card-text">{movie.release_date}</p>
                                <a href={movie.url} className="btn btn-primary">Learn more</a>
                            </div>
                        </div>
                    </>))}
            </div>)
    }
}

export default StudioGhibliComponent;