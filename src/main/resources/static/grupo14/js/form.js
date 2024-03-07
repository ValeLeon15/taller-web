window.onload = function(){
    const nombre = document.getElementById("nombre")
    const errorNombre = document.getElementById("errorNombre")
    const tamanoNombre = document.getElementById("tamanoNombre")
    const bordeNombre = document.getElementById("bordeNombre")
    const apellido = document.getElementById("apellido")
    const errorApellido = document.getElementById("errorApellido")
    const tamanoApellido = document.getElementById("tamanoApellido")
    const bordeApellido = document.getElementById("bordeApellido")
    const correo = document.getElementById("correo")
    const errorCorreo = document.getElementById("errorCorreo")
    const tamanoCorreo = document.getElementById("tamanoCorreo")
    const bordeCorreo = document.getElementById("bordeCorreo")
    const semestre = document.getElementById("semestre")
    const errorSemestre = document.getElementById("errorSemestre")
    const bordeSemestre = document.getElementById("bordeSemestre")

    //cuando lleno el formulario, queremos que ejecute esto
    nombre.addEventListener("input", function(){
        tamanoNombre.textContent =  nombre.value.length + '/100';
        let tipo = "nombre";
        if (nombre.value == parseInt(nombre.value) ||nombre.value.length == 0) {
            updateError(tipo, "El nombre es obligatorio y no debe ser un entero.");
        }else {
            errorNombre.textContent = '';
            bordeNombre.style.border="solid";
            bordeNombre.style.borderColor="green";
            
        }
    });

    apellido.addEventListener("input", function(){
        tamanoApellido.textContent =  apellido.value.length + '/100';
        let tipo = "apellido";
        if (apellido.value == parseInt(apellido.value) ||apellido.value.length == 0) {
            updateError(tipo, "El nombre es obligatorio y no debe ser un entero.");
        }else {
            errorApellido.textContent = '';
            bordeApellido.style.border="solid";
            bordeApellido.style.borderColor="green";
        }
    });

    //ahora Correo: Obligatorio, 100 caracteres. , que tenga el caracter ‘@’ y después de ese caracter por lo menos un punto, no debe tener espacios y nada de caracteres espaciales como tildes, ñ, todo debe estar escrito en mayúsculas.
    correo.addEventListener("input", function(){
        tamanoCorreo.textContent =  correo.value.length + '/100';
        let tipo = "correo";
        if (correo.value.length == 0) {
            updateError(tipo, "El correo es obligatorio.");
        }else if (correo.value.length > 100) {
            updateError(tipo, "El correo no debe tener más de 100 caracteres.");
        }else if (correo.value.includes(" ")) {
            updateError(tipo, "El correo no debe tener espacios.");
        }else if (!correo.value.includes("@") || !correo.value.includes(".")) {
            updateError(tipo, "El correo debe tener un @ y un punto.");
        } else if(correo.value != correo.value.toUpperCase()){
            updateError(tipo, "El correo debe estar en mayúsculas.");
        }
        else {
            errorCorreo.textContent = '';
            bordeCorreo.style.border="solid";
            bordeCorreo.style.borderColor="green";
        }
    });

    semestre.addEventListener("input", function(){
        let tipo = "semestre";
        if (semestre.value >= 0 && semestre.value <= 16) {
            errorSemestre.textContent = '';
            bordeSemestre.style.border="solid";
            bordeSemestre.style.borderColor="green";
        }else {
            updateError(tipo, "El semestre debe ser un número entre 1 y 16.");

        }
    });

    function updateError(tipo, mensaje) {
        if (tipo == "nombre") {
            errorNombre.textContent = mensaje;
            errorNombre.style.color = "red";
            bordeNombre.style.border="solid";
            bordeNombre.style.borderColor="red";
        } if (tipo == "apellido") {
            errorApellido.textContent = mensaje;
            errorApellido.style.color = "red";
            bordeApellido.style.border="solid";
            bordeApellido.style.borderColor="red";
        } if (tipo == "correo") {
            errorCorreo.textContent = mensaje;
            errorCorreo.style.color = "red";
            bordeCorreo.style.border="solid";
            bordeCorreo.style.borderColor="red";
        } if (tipo == "semestre") {
            errorSemestre.textContent = mensaje;
            errorSemestre.style.color = "red";
            bordeSemestre.style.border="solid";
            bordeSemestre.style.borderColor="red";
        }
    }


}