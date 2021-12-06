int led_principal = 6;
int led_bano = 5;
int brillo_principal = 0;
int brillo_bano = 0;
int horaDia = 0;
bool automatico = true;
bool ventanaAbierta = true;
bool dormir = false;

void setup()
{
  pinMode(led_principal, OUTPUT);
  pinMode(led_bano, OUTPUT);
  Serial.begin(9600);
}

void loop()
{
  // -------------------- Datos emitidos desde JAVA. -------------------
  if (Serial.available() > 0){
    switch (Serial.read()){
      // ------------- sliders
      // Control de luminosidad de la habitacion. Valores de Slider
      case '0':
        brillo_principal = 0;
        break;
      case '1':
        brillo_principal = 15;
        break;
      case '2':
        brillo_principal = 60;
        break;
      case '3':
        brillo_principal = 120;
        break;
      case '4':
        brillo_principal = 180;
        break;
      case '5':
        brillo_principal = 255;
        break;
      // Control de luminosidad del Baño. Valores de Slider
      case '6':
        brillo_bano = 0;
        break;
      case '7':
        brillo_bano = 15;
        break;
      case '8':
        brillo_bano = 60;
        break;
      case '9':
        brillo_bano = 120;
        break;
      case 'a':
        brillo_bano = 180;
        break;
      case 'A':
        brillo_bano = 255;
        break;
      // Simulación del tiempo. Valores de Slider
      case 'b':
        horaDia = 6;
        break;
      case 'B':
        horaDia = 12;
        break;
      case 'c':
        horaDia = 18;
        break;
      case 'C':
        horaDia = 24;
        break;
        

      // -------------- Botonoes
      // Señal modo manual
      case 'd':
        automatico = false;
        break;
      // Señal modo automatico
      case 'D':
        automatico = true;
        break;
      
      // Señal de ventana. Encendido.
      case 'e':
        ventanaAbierta = true;
      // Señal de ventana. Apagado
        break;
      case 'E':
        ventanaAbierta = false;
        break;
      
      // Señal de dormir. Encendido 
      case 'f':
        dormir = true;
        automatico = false;
        ventanaAbierta = false;
        break;
      // Señal de dormir. Apagado
      case 'F':
        dormir = false;
        automatico = true;
        break;
      
      default:
        break;
    }
  }
  // -------------------------------------------------------------------
  
  if (automatico == true){
    
    switch (horaDia)
    {
    case 6:
      brillo_principal = 60;
      brillo_bano = 60;
      break;
    case 12:
      brillo_principal = 0;
      brillo_bano = 0;
      break;
    case 18:
      brillo_principal = 60;
      brillo_bano = 60;
      break;
    case 24:
      brillo_principal = 255;
      brillo_bano = 255;
      break;
    default:
      break;
    }


  }else{

  }

  if(dormir == true){
    
  }

  analogWrite(led_principal, brillo_principal);
  analogWrite(led_bano, brillo_bano);
}
