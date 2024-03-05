document.addEventListener("DOMContentLoaded", function() {
  var nombresInput = document.getElementById("nombre");
  var apellidosInput = document.getElementById("apellido");
  var correoInput = document.getElementById("correo");
  var semestreInput = document.getElementById("semestre");
  var descripcionTextarea = document.getElementById("descripcion");

  var charCountDisplay = document.createElement("div");
  charCountDisplay.style.color = "green";
  charCountDisplay.style.marginTop = "5px";
  document.querySelector(".form__questions").appendChild(charCountDisplay);

  function updateCharCount(input, maxChars) {
    var charCount = input.value.length;
    charCountDisplay.innerText = charCount + "/" + maxChars;
    if (charCount > maxChars) {
      input.style.borderColor = "red";
    } else {
      input.style.borderColor = "";
    }
  }

  function validateName() {
    console.log("Validating name...");
    var name = nombresInput.value;
    if (name === "") {
      alert("Por favor, ingrese su nombre.");
      return false;
    }
    if (name.length > 100) {
      alert("El nombre no puede tener más de 100 caracteres.");
      return false;
    }
    return true;
  }

  function validateLastName() {
    console.log("Validating last name...");
    var lastName = apellidosInput.value;
    if (lastName === "") {
      alert("Por favor, ingrese sus apellidos.");
      return false;
    }
    if (lastName.length > 100) {
      alert("Los apellidos no pueden tener más de 100 caracteres.");
      return false;
    }
    return true;
  }

  function validateEmail() {
    console.log("Validating email...");
    var email = correoInput.value.toUpperCase();
    var re = /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/;
    if (email === "" || !re.test(email)) {
      alert("Por favor, ingrese una dirección de correo electrónico válida.");
      return false;
    }
    return true;
  }

  function validateSemester() {
    console.log("Validating semester...");
    var semester = parseInt(semestreInput.value);
    if (isNaN(semester) || semester < 1 || semester > 16) {
      alert("El semestre debe ser un número entre 1 y 16.");
      return false;
    }
    return true;
  }

  function validateDescription() {
    console.log("Validating description...");
    var description = descripcionTextarea.value;
    if (description === "") {
      alert("Por favor, ingrese una descripción.");
      return false;
    }
    return true;
  }

  function validateForm() {
    var isNameValid = validateName();
    var isLastNameValid = validateLastName();
    var isEmailValid = validateEmail();
    var isSemesterValid = validateSemester();
    var isDescriptionValid = validateDescription();

    return isNameValid && isLastNameValid && isEmailValid && isSemesterValid && isDescriptionValid;
  }

  nombresInput.addEventListener("input", function() {
    console.log("Input event on name field.");
    updateCharCount(nombresInput, 100);
  });

  apellidosInput.addEventListener("input", function() {
    console.log("Input event on last name field.");
    updateCharCount(apellidosInput, 100);
  });

  correoInput.addEventListener("input", function() {
    console.log("Input event on email field.");
    updateCharCount(correoInput, 100);
  });

  semestreInput.addEventListener("input", function() {
    console.log("Input event on semester field.");
    updateCharCount(semestreInput, 2);
  });

  descripcionTextarea.addEventListener("input", function() {
    console.log("Input event on description field.");
    updateCharCount(descripcionTextarea, 500);
  });

  document.getElementById("submission").addEventListener("click", function(event) {
    console.log("Submit button clicked.");
    event.preventDefault(); // Prevent form submission for now

    if (!validateForm()) {
      charCountDisplay.innerText = "Revisa los campos resaltados en rojo.";
      charCountDisplay.style.color = "red";
      return false;
    }

    // Continue with form submission logic if needed

    // Example: document.querySelector(".form__questions").submit();
    
    // Show confirmation message
    alert("¡Formulario válido! La información ha sido enviada correctamente.");
    charCountDisplay.innerText = "";
    charCountDisplay.style.color = "green";

    // Reset form values
    nombresInput.value = "";
    apellidosInput.value = "";
    correoInput.value = "";
    semestreInput.value = "";
    descripcionTextarea.value = "";
  });
});
