public class Data {

    private static final Map<String, String> affixMap;
    static {
        Map<Integer, String> aMap = new HashMap<>();
        aMap.put("ganglioma", "ganglioglioma");
        aMap.put("cancer", "carcinoma");
        affixMap = Collections.unmodifiableMap(aMap);
    }
	
    private static final Map<String, String> prefixMap;
    static {
        Map<Integer, String> aMap = new HashMap<>();
        aMap.put("pre", "near");
        aMap.put("pre", "first");
        aMap.put("dysry", "arrhy");
        aMap.put("cut", "subcut");
        aMap.put("use", "abuse");
        aMap.put("fore", "");		
        prefixMap = Collections.unmodifiableMap(aMap);
    }	
	
    private static final Map<String, String> suffixMap;
    static {
        Map<Integer, String> aMap = new HashMap<>();
        aMap.put("tic", "sis");
        aMap.put("sis", "tic");
        aMap.put("oneal", "ineum");
        aMap.put("age", "");
        aMap.put("cular", "cal");
        aMap.put("cardiac", "cardia");
        aMap.put("nic", "nia");
        aMap.put("ages", "ed");
        aMap.put("evi", "evus");
        aMap.put("tachy", "tachicardia");
        aMap.put("cral", "crum");
        aMap.put("cancer", "carcinoma");
        aMap.put("sillar", "sil");
        aMap.put("elt", "eeling");
        aMap.put("sed", "sis");
        aMap.put("ses", "sis");
        aMap.put("ation", "ed");
        aMap.put("erium", "irium");
        aMap.put("iate", "ioid");
        aMap.put("ric", "ria");
        aMap.put("brady", "bradycardia");
        aMap.put("tricle", "tricular");
        aMap.put("culi", "culus");
        aMap.put("ter", "teral");
        aMap.put("eral", "eric");
        aMap.put("etoh", "alcohol");
        aMap.put("sis", "ticemia");
        aMap.put("ky", "kes");
        aMap.put("ny", "ne");
        aMap.put("aldo", "aldosteronism");
        aMap.put("tion", "sion");
        aMap.put("gliom", "glioma");
        aMap.put("sion", "tion");
        aMap.put("tic", "ta");
        aMap.put("tal", "tum");
        aMap.put("cemic", "cemia");
        aMap.put("ncy", "nt");
        aMap.put("esoph", "esophageal");
        aMap.put("polyp", "polyposis");
        aMap.put("lum", "lar");
        aMap.put("red", "ry");
        aMap.put("ness", "ng");
        aMap.put("psed", "pse");
        aMap.put("sions", "sion");
        aMap.put("tive", "");
        aMap.put("men", "minal");
        aMap.put("ptum", "ptal");
        aMap.put("ates", "ated");
        aMap.put("tious", "tion");
        aMap.put("ged", "gement");
        aMap.put("ted", "tation");
        aMap.put("tory", "tion");
        aMap.put("cula", "culosis");
        aMap.put("vi", "vus");
        aMap.put("wer", "wing");
        aMap.put("chy", "ch");
        aMap.put("lt", "eling");
        aMap.put("cification", "city");
        aMap.put("lm", "lmonary");
        aMap.put("cification", "cities");
        aMap.put("tus", "tal");
        suffixMap = Collections.unmodifiableMap(aMap);
    }		
	
	List<String> prepositionsList = new ArrayList<>() {{
		add("in");
		add("with");
		add("on");
		add("of");
	}}
	
	List<String> disorderSynonymsSingularList = new ArrayList<>() {{
		add("disease");
		add("disorder");
		add("condition");
		add("syndrome");
		add("symptom");
		add("abnormality");
		add("NOS");
		add("event");
		add("episode");
		add("issue");
		add("impairment");		
	}}
	
	List<String> disorderSynonymsPluralList = new ArrayList<>() {{
		add("diseases");
		add("disorders");
		add("conditions");
		add("syndromes");
		add("symptoms");
		add("abnormalities");
		add("events");
		add("episodes");
		add("issues");
		add("impairments");		
	}}
	
}