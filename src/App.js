/**Desarrollado por
    Edwin Geovani Pérez Martínez
    Fecha de modificacion 02 de octubre de 2024*/

    /*Bajo la instrucion del ing.Jhonathan Josué García Cuque*/
    
import React, { useState, useEffect } from 'react';
import axios from 'axios';
import NotaForm from './components/NotaForm';
import NotaList from './components/NotaList';

function App() {
    const [notas, setNotas] = useState([]);
    const [currentNota, setCurrentNota] = useState(null);

    useEffect(() => {
        obtenerNotas();
    }, []);

    const obtenerNotas = async () => {
        try {
            const response = await axios.get('http://localhost:8080/api/notas');
            setNotas(response.data);
        } catch (error) {
            console.error('Error al obtener las notas:', error);
        }
    };

    const crearNota = async (nota) => {
        try {
            if (currentNota) {
                 // Si existe una nota para editar
                 await axios.get(`http://localhost:8080/api/notas/${currentNota.id}`, nota); 
                 setCurrentNota(null); //Resetea el formulario
            } else {
                // Si es una nueva nota
                await axios.post('http://localhost:8080/api/notas', nota); //metodo POST
            }
            obtenerNotas(); // Refresca la lista de notas después de guardar
        } catch (error) {
            console.error('Error al guardar la nota:', error);
        }
    };

    const eliminarNota = async (id) => {
        try {
            await axios.delete(`http://localhost:8080/api/notas/${id}`);
            obtenerNotas(); //refresca la lista de notas despues de eliminar 
        } catch (error) {
            console.error('Error al eliminar la nota:', error);
        }
    };

    const editarNota = (nota) => {
        setCurrentNota(nota);
    };

    return (
        <div>
            <h1>Gestión de Notas</h1>
            <NotaForm onSubmit={crearNota} currentNota={currentNota} />
            <NotaList notas={notas} onEdit={editarNota} onDelete={eliminarNota} />
        </div>
    );
}

export default App;
