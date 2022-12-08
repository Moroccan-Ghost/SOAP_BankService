package BankServices;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date dateCreation;

    public Compte(int code, double solde, Date dateCreation) {
        setCode(code);
        setSolde(solde);
        setDateCreation(dateCreation);
    }

    public Compte() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
