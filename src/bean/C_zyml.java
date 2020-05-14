package bean;


/**
 * gentime:2018-02-09 15:15:28.834
*/
public class C_zyml implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String zyml_h;
    private String mc;
    private String jc;

    public C_zyml() {
    }

    public void setZyml_h(String zyml_h) { 
        this.zyml_h = zyml_h;
    }
    public String getZyml_h() { 
        return zyml_h;
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

    @Override
    public int hashCode() { 
        return zyml_h == null ? 0 : zyml_h.hashCode();
    }

    @Override
    public boolean equals(Object obj) { 
        if (obj instanceof C_zyml) {
            C_zyml entity = (C_zyml)obj;
            return zyml_h != null && zyml_h.equals(entity.getZyml_h());
        } else {
            return false;
        }
    }

}