package model;

import java.util.Date;

/**
 * Created by Tatsunori on 14/05/2018.
 */
public class Cotacao {
    Date data;
    Float quo;
    Float min, max;
    Float var, pvar;
    Float vol;


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Float getQuo() {
        return quo;
    }

    public void setQuo(Float quo) {
        this.quo = quo;
    }

    public Float getMin() {
        return min;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public Float getMax() {
        return max;
    }

    public void setMax(Float max) {
        this.max = max;
    }

    public Float getVar() {
        return var;
    }

    public void setVar(Float var) {
        this.var = var;
    }

    public Float getPvar() {
        return pvar;
    }

    public void setPvar(Float pvar) {
        this.pvar = pvar;
    }

    public Float getVol() {
        return vol;
    }

    public void setVol(Float vol) {
        this.vol = vol;
    }
}
