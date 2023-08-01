import React, { useEffect, useState } from 'react';

export const TheSimpsonsComponent = () => {

    const [characterList, setCharacterList] = useState([]);
    useEffect(() => {
        Liferay.Service(
            '/thesimpsonsapi.character/get-all-characters',
            function (obj) {
                console.log(obj);
                setCharacterList(obj)
            }
        );
    }, []);


    const handleEdit = () => {
        console.log("Voy a editar");
    };

    const handleDelete = (id) => {
        Liferay.Service(
            '/thesimpsonsapi.character/delete-character',
            {
                characterId: id
            },
            function (obj) {
                console.log(obj);
            }
        );
    };
    return (
        <div className="filmContainer mt-3">
            {characterList.length <= 0 && (
                <h2 style={{ color: "red" }}>
                    <strong>No se encuentran personajes</strong>
                </h2>
            )}
            {characterList.map((character) => (
                    <div className="card cardWidth simpsonsCard" key={character.characterId}>
                        <img
                            alt={`${character.name} poster`}
                            src={character.image}
                            className="card-img-top"
                        />
                        <div className="card-body">
                            <h4 className="card-title"> {character.name}</h4>
                            <p className="card-text">{character.description}</p>
                            <div>
                                <button className="simpsonsButton" onClick={handleEdit}>Edit</button>
                            </div>
                            <div>
                                <button className="simpsonsButton" onClick={() => handleDelete(character.characterId)}>Delete</button>
                            </div>
                        </div>
                    </div>
                ))
            }
        </div>
    );
}
export default TheSimpsonsComponent;