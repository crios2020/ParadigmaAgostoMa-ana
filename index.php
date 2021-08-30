<?php
    echo '<h1>Hola Mundo!</h1>';

    class Cuenta {

        //atributos
        private $nro;
        private $moneda;
        private $saldo;

        //Método constructor
        public function Cuenta($nro,$moneda){
            $this->nro=$nro;
            $this->moneda=$moneda;
            $this->saldo=0;
        }

        //métodos
        public function depositar($monto){
            $this->saldo=$this->saldo+$monto;
        }

        public function debitar($monto){
            if($this->saldo>$monto){
                $this->saldo=$this->saldo-$monto;
            } else {
                echo '<h3>No hay Fondos</h3>';
            }
        }

        public function getEstado(){
            echo $this->nro.' '.$this->moneda.' '.$this->saldo.'<br>';
        }

    }//end class Cuenta

    echo '<h3>-- cuenta1 --</h3>';
    $cuenta1=new Cuenta(1,'arg$');
	//$cuentax=new Cuenta();		//error

    //$cuenta1->saldo=300000000;
    $cuenta1->depositar(20000);
    $cuenta1->depositar(30000);
    $cuenta1->debitar(5000);
    $cuenta1->getEstado();

    class Cliente{
        private $nombre;
        private $cuenta;

        public function Cliente($nombre,$nroCuenta){
            $this->nombre=$nombre;
            $this->cuenta=new Cuenta($nroCuenta,'arg$');
        }

        public function getCuenta(){
            return $this->cuenta;
        }

    }//end class Cliente

    echo '<h3> -- cliente1 --</h3>';
    $cliente1=new Cliente('Juan Perez',2);
    //$cliente1->depositar(50000);
    $cliente1->getCuenta()->depositar(50000);

    echo '<h3>-- Fin del programa --</h3>';
?>
