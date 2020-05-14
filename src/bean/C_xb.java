package bean;


/**
 * gentime:2016-09-19 15:08:25.584
*/
public class C_xb implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String xb_h;
    private String mc;
    private String jc;

    public C_xb() {
    }

  

    public String getXb_h() {
		return xb_h;
	}



	public void setXb_h(String xb_h) {
		this.xb_h = xb_h;
	}



	public void setMc(String mc) { 
        this.mc = mc;
    }
    public String getMc() { 
        return mc;
    }

    public void setJc(String jc) { 
        this.jc = jc;
    }
    public String getJc() { 
        return jc;
    }

    @Override
    public String toString() { 
        return mc;
    }

}