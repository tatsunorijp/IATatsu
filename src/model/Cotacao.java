package model;

import java.util.Date;
import java.util.Objects;

/**
 * Created by Tatsunori on 14/05/2018.
 */
public class Cotacao {
    public String data;
    public Float quo;
    public Float min, max;
    public Float var, pvar;
    public Float vol;
    public Float predicao;
    public Float aptidao;

    public Float getAptidao() {
        return aptidao;
    }

    public void setAptidao(Float aptidao) {
        this.aptidao = aptidao;
    }

    public Float getPredicao() {
        return predicao;
    }

    public void setPredicao(Float predicao) {
        this.predicao = predicao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
