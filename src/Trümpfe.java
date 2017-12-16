public enum Trümpfe {


    SAUSPIEL(Karte.EICHEL_OBER);

    private Karte[] truempfe;

    private Trümpfe(Karte... truempfe) {
        this.truempfe = truempfe;
    }

}
