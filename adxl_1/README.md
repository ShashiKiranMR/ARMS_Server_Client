* adxl_1 contains TCP server and client program for the adxl345 interface to esp8266.
* "Adafruit_ADXL345_U.h" and "Adafruit_Sensor.h" are the libraries required.
* "adxl_1.ino" is a client program which reads accelerometer data and sends to the server whose socket address is known.
* "TCPserver.java" is the TCP server running on a laptop. 
* Procedure:
  - Create a hotspot.
  - Connect your laptop to the created wifi network.
  - Connect the esp8266 also to the same wifi network.
  - Provide the socket address of the server to the esp8266.
  - Run the TCPserver.java on your laptop.
  - Load the adxl_1.ino on esp8266 using Arduino IDE.
  - See the values at the server.
