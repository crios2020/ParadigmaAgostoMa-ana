# Ejemplo en Python
from tkinter import messagebox
from tkinter.messagebox import * 

class Auto():

    #atributos
    marca = ''
    modelo = ''	
    color = ''
    velocidad = 0

    #métodos
    def acelerar(self):
        self.velocidad=self.velocidad+10
    
    def acelerarInt(self,kilometros):
        self.velocidad=self.velocidad+kilometros

    def frenar(self):
        self.velocidad=self.velocidad-10

    def imprimirVelocidad(self):
        print(self.velocidad)
    
    def obtenerVelocidad(self):
        return self.velocidad
    
    def funcion(self):
        print('Esto es un método!')

def funcion():
    print('Esto es una función!')


print('Hola Mundo!')
auto1 = Auto()      #llama al constructor de auto
auto1.marca='Fiat'
auto1.acelerar()        # 10
auto1.acelerarInt(12)   # 22
auto1.imprimirVelocidad()
print('Velocidad: ',auto1.obtenerVelocidad())
messagebox.showinfo(auto1.obtenerVelocidad())
auto1.funcion()         #Esto es un método!
funcion()               #Esto es una función!
