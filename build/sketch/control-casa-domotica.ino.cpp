#include <Arduino.h>
#line 1 "c:\\Users\\luisf\\Workspace\\Java\\ADP\\controlArduino\\control-casa-domotica-arduino\\control-casa-domotica.ino"
int led_principal = 6;
int led_bano = 5;
int brillo_principal = 0;
int brillo_bano = 0;
int horaDia = 0;
int sensor = 4;
int lectura_sensor = 0;
bool automatico = true;
bool ventanaAbierta = false;
bool dormir = false;

// Si se requiere invertir la lógica de los interruptores modificar estos:
int highVal = 0;
int lowVal = 1;
int limiteInterruptorAbajo = 2;
int limiteInterruptorArriba = 3;
int cortinaHaciaArriba = 10;
int cortinaHaciaAbajo = 9;
int subirCortina = 0;
int bajarCortina = 0;

#line 22 "c:\\Users\\luisf\\Workspace\\Java\\ADP\\controlArduino\\control-casa-domotica-arduino\\control-casa-domotica.ino"
void setup();
#line 36 "c:\\Users\\luisf\\Workspace\\Java\\ADP\\controlArduino\\control-casa-domotica-arduino\\control-casa-domotica.ino"
void loop();
#line 22 "c:\\Users\\luisf\\Workspace\\Java\\ADP\\controlArduino\\control-casa-domotica-arduino\\control-casa-domotica.ino"
void setup()
{
  pinMode(led_principal, OUTPUT);
  pinMode(led_bano, OUTPUT);
  

  pinMode(sensor, INPUT);
  pinMode(limiteInterruptorAbajo, INPUT_PULLUP);
  pinMode(limiteInterruptorArriba, INPUT_PULLUP);
  pinMode(cortinaHaciaArriba, OUTPUT);
  pinMode(cortinaHaciaAbajo, OUTPUT);
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
    
  if (automatico == true)
  {
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
      if (digitalRead(limiteInterruptorArriba) == highVal)
      {
        subirCortina = LOW;
        bajarCortina = HIGH;
      }
      if (digitalRead(limiteInterruptorAbajo) == highVal)
      {
        subirCortina = LOW;
        bajarCortina = LOW;
      }
      break;
    case 24:
      brillo_principal = 255;
      brillo_bano = 255;
      break;
    default:
      break;
    }
  }

  if (automatico == false)
  {
    if(ventanaAbierta == true){
      if (digitalRead(limiteInterruptorAbajo) == highVal)
      {
        subirCortina = HIGH;
        bajarCortina = LOW;
      }
      if (digitalRead(limiteInterruptorArriba) == highVal)
      {
        subirCortina = LOW;
        bajarCortina = LOW;
      }
    }else{
      if (digitalRead(limiteInterruptorArriba) == highVal)
      {
        subirCortina = LOW;
        bajarCortina = HIGH;
      }
      if (digitalRead(limiteInterruptorAbajo) == highVal)
      {
        subirCortina = LOW;
        bajarCortina = LOW;
      }
    }
    
  }

  if (dormir == true)
  {
    //  --------- Sensor ------
    lectura_sensor = digitalRead(sensor);
    if (lectura_sensor == HIGH)
    {
      brillo_principal = 255;
      brillo_bano = 255;

      // ACTIVAR EN CASO DE REQUERIR DELAY PARA SENSOR
      //delay(5000);
    }
    else
    {
      brillo_principal = 0;
      brillo_bano = 0;
    }

    // ------ INTERRUPTORES --------
    // Suponiendo que el interruptor se cierra cuando se toca el límite
    if (digitalRead(limiteInterruptorArriba) == highVal)
    {
      subirCortina = LOW;
      bajarCortina = HIGH;
    }
    if (digitalRead(limiteInterruptorAbajo) == highVal)
    {
      subirCortina = LOW;
      bajarCortina = LOW;
    }
  }

  analogWrite(led_principal, brillo_principal);
  analogWrite(led_bano, brillo_bano);
  digitalWrite(cortinaHaciaAbajo, bajarCortina);
  digitalWrite(cortinaHaciaArriba, subirCortina);
}

