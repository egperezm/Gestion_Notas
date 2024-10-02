import React from 'react';

const NotaList = ({ notas, onEdit, onDelete }) => {
    return (
        <table>
            <thead>
                <tr>
                    <th>Estudiante</th>
                    <th>Actividades</th>
                    <th>Primer Parcial</th>
                    <th>Segundo Parcial</th>
                    <th>Examen Final</th>
                    <th>Puntaje Total</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                {notas.length > 0 ? (
                    notas.map((nota) => (
                        <tr key={nota.id}>
                            <td>{nota.estudiante}</td>
                            <td>{nota.actividades}</td>
                            <td>{nota.primerParcial}</td>
                            <td>{nota.segundoParcial}</td>
                            <td>{nota.examenFinal}</td>
                            <td>{nota.puntajeTotal}</td>
                            <td>
                                <button onClick={() => onEdit(nota)}>Editar</button>
                                <button onClick={() => onDelete(nota.id)}>Eliminar</button>
                            </td>
                        </tr>
                    ))
                ) : (
                    <tr>
                        <td colSpan="7">No hay notas registradas</td>
                    </tr>
                )}
            </tbody>
        </table>
    );
};

export default NotaList;