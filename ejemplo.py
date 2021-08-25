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
	def acelerar():
		self.velocidad=self.velocidad+10

    def acelerar2(kilometros):
        self.velocidad=self.velocidad+kilometros
		
	def frenar():
		self.velocidad=self.velocidad-10

    def imprimirVelocidad():
        print(self.velocidad)
    
    def obtenerVelocidad():
        return self.velocidad

print('Hola Mundo!')
auto1 = Auto()      #llama al constructor de auto
auto1.marca='Fiat'
auto1.acelerar()    # 10
auto1.imprimirVelocidad()
print('Velocidad: ',auto1.obtenerVelocidad())
messagebox.showinfo(auto1.obtenerVelocidad())
