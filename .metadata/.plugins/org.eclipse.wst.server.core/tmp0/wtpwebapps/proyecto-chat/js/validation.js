$(document).ready(function(){
    $("#formulario").validate({
      rules:{
        nombres:{
          required:true,
          maxlength:50
        },
        apellidos:{
          required:true,
          maxlength:50
        },
        usuario:{
          required:true,
          maxlength:30
        },
        email:{
          required:true,
          email:true,
          maxlength:120
        },
        clave:{
          pwcheck:true,
          required:true
        },
        clavecon:{
          required:true,
          equalTo : "#clave"
        },
        terminos:{
          required:true,
        }
      },
      messages:{
        nombres:{
          required:'Ingresa tu Nombre',
          maxlength:'Por favor, no ingreses más de 50 carácteres'
        }
        ,
        apellidos:{
          required:'Ingresa tu Apellido',
          maxlength:'Por favor, no ingreses más de 50 carácteres'
        },
        usuario:{
          required:'Ingresa un nombre de Usuario',
          maxlength:'Por favor, no ingreses más de 30 carácteres'
        },
        email:{
          required:'Ingresa tu Correo Electrónico',
          email:'Ingresa el formato correcto @',
          maxlength:'Por favor, no ingreses más de 120 carácteres'
        },
        clave:{
          pwcheck:'La contraseña debe tener entre 8 y 20 caracteres, al menos un dígito, una minúscula y una mayúscula',
          required:'Ingresa una contraseña'
        },
        clavecon:{
          required:'Confirma tu contraseña',
          equalTo : "Por favor, ingresa la misma contraseña"
        },
        terminos:{
          required:'Marca la casilla',
        }
      },
      errorElement: "small",
      errorPlacement: function(error, element) {
        if(element.attr("name") == "terminos") {
          error.appendTo( element.parent("div").next("div") );
        } else {
          error.insertAfter(element);
        }
      }
    });
  });
  $.validator.addMethod("pwcheck", function(value) {
    return /((?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,20})/.test(value)
 });
  