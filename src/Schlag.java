public enum Schlag {
    ASS (0),
    ZEHNER (1),
    KÖNIG (2),
    OBER (3),
    UNTER (4),
    NEUNER (5),
    ACHTER (6),
    SIEBENER (7);
    private int wertigkeit;
    private Schlag (int wertigkeit){
        this.wertigkeit=wertigkeit;
    }
}
