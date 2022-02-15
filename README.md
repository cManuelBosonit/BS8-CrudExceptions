# BS8-CrudExceptions

Crear dos tipos de excepción al CRUD anteriormente realizado:
NotFoundException que generara un código HTTP 404. Se lanzará cuando no se encuentren registros en un findById o si al borrar o modificar un registro este no existe.
UnprocesableException que devolverá un 422 (UNPROCESSABLE ENTITY) cuando la validación de los campos no cumpla los requisitos establecidos, al modificar o insertar un registro.
Ambas excepciones deberán devolver un objeto llamado CustomError con los campos: 
Date timestamp;
Int HttpCode;
String mensaje; // Devolverá el mensaje de error. 
