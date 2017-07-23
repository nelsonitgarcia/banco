public class Cliente{
    private Integer idCliente;
    private String nombreCliente;
    private Intger nit;
    
    public void cliente(){
    }
    
    public void setIdCliente(Integer aIdCliente){
        this.idCliente = aIdCliente;
    }
    
    public Integer getIdCliente(){
        return this.idCliente;
    }
    
    public void setNombreCliente(String aNombreCliente) {
        this.nombreCliente = aNombreCliente;         
    }
        
    public void getNombreCliente() {
        return this.nombreCliente;         
    }
    
    public void setNit(Integer aNit){
        this.nit = aNit;
    }
    
    public Integer getNit(){
        return this.nit;
    }
    
    public string toString(){
        /* busqueda de datos*/
        return getNombreCliente() + " estmos  "+ getNit();

    }
    
    puclic compare(Cliente o){
    if (o.getIdCliente <> this.getIdCliente){
    }
    }        

}