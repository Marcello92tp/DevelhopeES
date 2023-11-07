public class Professore {

        private String idProfessore;
        private String nome;
        private String cognome;
        private String corsoInsegnato;

        // Costruttore che accetta tutti gli attributi
        public Professore(String idProfessore, String nome, String cognome, String corsoInsegnato) {
            this.idProfessore = idProfessore;
            this.nome = nome;
            this.cognome = cognome;
            this.corsoInsegnato = corsoInsegnato;
        }

        // Costruttore che inizializza il corso insegnato come vuoto
        public Professore(String idProfessore, String nome, String cognome) {
            this(idProfessore, nome, cognome, "");
        }

        // Getter e setter per gli attributi
        public String getIdProfessore() {
            return idProfessore;
        }

        public void setIdProfessore(String idProfessore) {
            this.idProfessore = idProfessore;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCognome() {
            return cognome;
        }

        public void setCognome(String cognome) {
            this.cognome = cognome;
        }

        public String getCorsoInsegnato() {
            return corsoInsegnato;
        }

        public void setCorsoInsegnato(String corsoInsegnato) {
            this.corsoInsegnato = corsoInsegnato;
        }

        // Metodo per assegnare un voto a uno studente
        public void assegnaVoto(Studente studente, int voto) {
            if (voto >= 18) {
                studente.getGrades().add(voto);
            } else {
                System.out.println("Hai fallito il corso. Riprova l'anno prossimo.");
            }
        }
    }


