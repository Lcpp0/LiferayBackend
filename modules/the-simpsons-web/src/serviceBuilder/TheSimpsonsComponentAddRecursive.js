import React, { useState } from 'react';

export const TheSimpsonsComponentAddRecursive = () => {
  const [formData, setFormData] = useState({
    name: '',
    description: '',
    image: '',
    genre: '',
  });

  const handleInputChange = (event) => {
    const { name, value } = event.target;
    setFormData((prevFormData) => ({
      ...prevFormData,
      [name]: value,
    }));
  };

  const handleFormSubmit = (event) => {
    event.preventDefault(); // Prevent the default form submission behavior

    // Now you can use the formData object to submit the form data
    console.log('Form data:', formData);

    // Perform further actions like calling Liferay.Service to create the character
    Liferay.Service(
      '/thesimpsonsapi.character/create-character',
      {
        name: formData.name,
        description: formData.description,
        image: formData.image,
        genre: formData.genre,
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
            <span className="span-contact">Recursive</span>
              <span className="span-contact">Ingrese el Personaje</span>
              <p>A continuación los datos a ingresar</p>
            </div>
            <div className="inputs">
              <input
                name="name"
                className="input-contact"
                type="text"
                placeholder="Nombre"
                value={formData.name}
                onChange={handleInputChange}
              />
              <input
                name="description"
                className="input-contact"
                type="text"
                placeholder="Descripción"
                value={formData.description}
                onChange={handleInputChange}
              />
              <input
                name="image"
                className="input-contact"
                type="text"
                placeholder="Imagen"
                value={formData.image}
                onChange={handleInputChange}
              />
              <input
                name="genre"
                className="input-contact"
                type="text"
                placeholder="Genero"
                value={formData.genre}
                onChange={handleInputChange}
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

export default TheSimpsonsComponentAddRecursive;