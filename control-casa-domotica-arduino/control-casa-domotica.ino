int led_principal = 6;
int led_bano = 5;
int brillo_principal = 0;
int brillo_bano = 0;

void setup()
{
  pinMode(led_principal, OUTPUT);
  pinMode(led_bano, OUTPUT);
  Serial.begin(9600);
}

void loop()
{
  //255 = low; 0 = high; Lógica inversa.
  if(Serial.available()>0){
    switch(Serial.read()){
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
      default:
      break;
      }
  }
  
  analogWrite(led_principal, brillo_principal);
  analogWrite(led_bano, brillo_bano);
}
