public enum Karte {
    EICHEL_ASS (Farbe.EICHEL,Schlag.ASS),
    EICHEL_ZEHNER(Farbe.EICHEL,Schlag.ZEHNER),
    EICHEL_KÖNIG(Farbe.EICHEL,Schlag.KÖNIG),
    EICHEL_OBER(Farbe.EICHEL,Schlag.OBER),
    EICHEL_UNTER(Farbe.EICHEL,Schlag.UNTER),
    EICHEL_NEUNER(Farbe.EICHEL,Schlag.NEUNER),
    EICHEL_ACHTER(Farbe.EICHEL,Schlag.ACHTER),
    EICHEL_SIEBENER(Farbe.EICHEL,Schlag.SIEBENER),
    GRASS_ASS(Farbe.GRASS,Schlag.ASS),
    GRASS_ZEHNER(Farbe.GRASS,Schlag.ZEHNER),
    GRASS_KÖNIG(Farbe.GRASS,Schlag.KÖNIG),
    GRASS_OBER(Farbe.GRASS,Schlag.OBER),
    GRASS_UNTER(Farbe.GRASS,Schlag.UNTER),
    GRASS_NEUNER(Farbe.GRASS,Schlag.NEUNER),
    GRASS_ACHETER(Farbe.GRASS,Schlag.ACHTER),
    GRASS_SIEBENER(Farbe.GRASS,Schlag.SIEBENER),
    HERZ_ASS(Farbe.HERZ,Schlag.ASS),
    HERZ_ZEHNER(Farbe.HERZ,Schlag.ZEHNER),
    HERZ_KÖNIG(Farbe.HERZ,Schlag.KÖNIG),
    HERZ_OBER(Farbe.HERZ,Schlag.OBER),
    HERZ_UNTER(Farbe.HERZ,Schlag.UNTER),
    HERZ_NEUNER(Farbe.HERZ,Schlag.NEUNER),
    HERZ_ACHTER(Farbe.HERZ,Schlag.ACHTER),
    HERZ_SIEBENER(Farbe.HERZ,Schlag.SIEBENER),
    SCHELLE_ASS(Farbe.SCHELLE,Schlag.ASS),
    SCHELLE_ZEHNER(Farbe.SCHELLE,Schlag.ZEHNER),
    SCHELLE_KÖNIG(Farbe.SCHELLE,Schlag.KÖNIG),
    SCHELLE_OBER(Farbe.SCHELLE,Schlag.OBER),
    SCHELLE_UNTER(Farbe.SCHELLE,Schlag.UNTER),
    SCHELLE_NEUNER(Farbe.SCHELLE,Schlag.NEUNER),
    SCHELLE_ACHTER(Farbe.SCHELLE,Schlag.ACHTER),
    SCHELLE_SIEBENER(Farbe.SCHELLE,Schlag.SIEBENER);


    private Schlag schlag;
    private Farbe farbe;
    private Karte (Farbe farbe, Schlag schlag){
        this.schlag=schlag;
        this.farbe = farbe;
    }
}
