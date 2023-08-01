import React, { useState} from 'react';

export const TheSimpsonsComponentAdd = () => {
    const [name, setName] = useState("");
    const [description, setDescription] = useState("");
    const [image, setImage] = useState("");
    const [genre, setGenre] = useState("");
  
    const handleNameChange = (event) => {
      setName(event.target.value);
    };
  
    const handleDescriptionChange = (event) => {
      setDescription(event.target.value);
    };
  
    const handleImageChange = (event) => {
      setImage(event.target.value);
    };
  
    const handleGenreChange = (event) => {
      setGenre(event.target.value);
    };
  
    const handleFormSubmit = (event) => {
      event.preventDefault(); // Prevent the default form submission behavior
  
      // Now you can use the state variables (name, description, image, genre) to submit the form data
      console.log("name", name);
      console.log("description", description);
      console.log("image", image);
      console.log("genre", genre);
  
      // Perform further actions like calling Liferay.Service to create the character
      Liferay.Service(
        '/thesimpsonsapi.character/create-character',
        {
          name: name,
          description: description,
          image: image,
          genre: genre,
        },
        function (obj) {
          console.log(obj);
        }
      );
    };
  
    return (
      <div className="container-center">
        <div className="body">
          <div className="container-form">
            <form className="contact-form" id="contact-form" onSubmit={handleFormSubmit}>
              <div className="head">
                <span className="span-contact">Ingrese el Personaje</span>
                <p>A continuación los datos a ingresar</p>
              </div>
              <div className="inputs">
                <input
                  name="user_name"
                  className="input-contact"
                  type="text"
                  placeholder="Nombre"
                  value={name}
                  onChange={handleNameChange}
                />
                <input
                  name="user_description"
                  className="input-contact"
                  type="text"
                  placeholder="Descripción"
                  value={description}
                  onChange={handleDescriptionChange}
                />
                <input
                  name="user_image"
                  className="input-contact"
                  type="text"
                  placeholder="Imagen"
                  value={image}
                  onChange={handleImageChange}
                />
                <input
                  name="user_genre"
                  className="input-contact"
                  type="text"
                  placeholder="Genero"
                  value={genre}
                  onChange={handleGenreChange}
                />
              </div>
  
              <button className="button-contact" type="submit">
                Enviar
              </button>
            </form>
          </div>
        </div>
      </div>
    );
  };
  
  export default TheSimpsonsComponentAdd;