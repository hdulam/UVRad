public class RadioCarro implements Radio{
    private boolean encendido;
    private boolean am;
    private double emisoraActual;
    private double[] botonesAM;
    private double[] botonesFM;
    
    public RadioCarro() {
        this.encendido = false;
        this.am = false;
        this.emisoraActual = 530.0;
        this.botonesAM = new double[6];
        this.botonesFM = new double[6];
    }

    @Override
    public void prenderRadio() {
        this.encendido = true;
    }

    @Override
    public void apagarRadio() {
        this.encendido = false;
    }

    @Override
    public void avanzarEstacion() {
        //aca va a revisar si es AM o FM para ver el tipo de incremento, si llegó al limite va a regresar a la mas baja de su categoria
        if (this.am) {
            this.emisoraActual += 10.0;
            if (this.emisoraActual > 1700.0) {
                this.emisoraActual = 530.0;
            }
        } else {
            this.emisoraActual += 0.2;
            if (this.emisoraActual > 108.0) {
                this.emisoraActual = 87.9;  
            }
        }
    }

    @Override
    public void guardarEstacion(int numeroBoton) {
        if (this.am) {
            this.botonesAM[numeroBoton] = this.emisoraActual;
        } else {
            this.botonesFM[numeroBoton] = this.emisoraActual;
        }
    }

    @Override
    public void cargarEstacion(int numeroBoton) {
        if (this.am) {
            this.emisoraActual = this.botonesAM[numeroBoton];
        } else {
            this.emisoraActual = this.botonesFM[numeroBoton];
        }
    }

    @Override
    public void cambiarFM() {
        this.am = false;
        this.emisoraActual = 87.9;
    }

    @Override
    public void cambiarAM() {
        this.am = true;
        this.emisoraActual = 530.0;
    }
}
