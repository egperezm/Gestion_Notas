/**Desarrollado por
    Edwin Geovani Pérez Martínez
    Fecha de modificacion 02 de octubre de 2024*/

    /*Bajo la instrucion del ing.Jhonathan Josué García Cuque*/
    
import React, { useState, useEffect } from 'react';

const NotaForm = ({ onSubmit, currentNota }) => {
    const [estudiante, setEstudiante] = useState('');
    const [actividades, setActividades] = useState('');
    const [primerParcial, setPrimerParcial] = useState('');
    const [segundoParcial, setSegundoParcial] = useState('');
    const [examenFinal, setExamenFinal] = useState('');

    useEffect(() => {
        if (currentNota) {
            setEstudiante(currentNota.estudiante);
            setActividades(currentNota.actividades);
            setPrimerParcial(currentNota.primerParcial);
            setSegundoParcial(currentNota.segundoParcial);
            setExamenFinal(currentNota.examenFinal);
        }
    }, [currentNota]);

    const handleSubmit = (e) => {
        e.preventDefault();
        const nota = {
            estudiante,
            actividades: parseFloat(actividades),
            primerParcial: parseFloat(primerParcial),
            segundoParcial: parseFloat(segundoParcial),
            examenFinal: parseFloat(examenFinal)
        };
        onSubmit(nota);
    };

    return (
        <form onSubmit={handleSubmit}>
            <div>
                <label>Estudiante:</label>
                <input type="text" value={estudiante} onChange={(e) => setEstudiante(e.target.value)} required />
            </div>
            <div>
                <label>Actividades:</label>
                <input type="number" value={actividades} onChange={(e) => setActividades(e.target.value)} max="35" required />
            </div>
            <div>
                <label>Primer Parcial:</label>
                <input type="number" value={primerParcial} onChange={(e) => setPrimerParcial(e.target.value)} max="15" required />
            </div>
            <div>
                <label>Segundo Parcial:</label>
                <input type="number" value={segundoParcial} onChange={(e) => setSegundoParcial(e.target.value)} max="15" required />
            </div>
            <div>
                <label>Examen Final:</label>
                <input type="number" value={examenFinal} onChange={(e) => setExamenFinal(e.target.value)} max="35" required />
            </div>
            <button type="submit">Guardar Nota</button>
        </form>
    );
};

export default NotaForm;
