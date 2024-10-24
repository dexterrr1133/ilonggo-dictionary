import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class word_storage {
    private HashMap<String, Translation> dictionary;

    public word_storage() {
        dictionary = new HashMap<>();
        initializeDictionary();
    }

    private void initializeDictionary() {
        dictionary.put("Punch", new Translation("Sapak", "Sumbag"));
        dictionary.put("Tired", new Translation("Pagod", "Kapoy"));
        dictionary.put("Nice", new Translation("Mabait", "Bu-ot"));
        dictionary.put("Tomorrow", new Translation("Bukas", "Bwas"));
        dictionary.put("Now", new Translation("Ngayon", "Subong"));
        dictionary.put("Afternoon", new Translation("Tanghali", "Udto"));
        dictionary.put("Later", new Translation("Mamaya", "Karun"));
        dictionary.put("Morning", new Translation("Umaga", "Aga"));
        dictionary.put("Strong", new Translation("Malakas", "Baskog"));
        dictionary.put("Many", new Translation("Marami", "Madamo"));
        dictionary.put("Beside", new Translation("Katabi", "Tupad"));
        dictionary.put("Ugly", new Translation("Pangit", "Kalaw-ay"));
        dictionary.put("Why", new Translation("Bakit", "Nga-a"));
        dictionary.put("Happen", new Translation("Mangyari", "Matabo"));
        dictionary.put("Mine", new Translation("Akin", "Akon"));
        dictionary.put("Yours", new Translation("Sayo", "Imo"));
        dictionary.put("Liar", new Translation("Sinungaling", "Butigon"));
        dictionary.put("Skin", new Translation("Balat", "Panit"));
        dictionary.put("Cat", new Translation("Pusa", "Kuring"));
        dictionary.put("Dance", new Translation("Sayaw", "Sa-ot"));
        dictionary.put("Rat", new Translation("Daga", "Ilaga")); 
        dictionary.put("Teeth", new Translation("Ngipin", "Unto"));
        dictionary.put("Clothes", new Translation("Damit", "Bayo"));
        dictionary.put("Vegetable", new Translation("Gulay", "Utan"));
        dictionary.put("Nephew", new Translation("Pamangkin", "Hinablos"));
        dictionary.put("Cry", new Translation("Iyak", "Hibi"));
        dictionary.put("Foot", new Translation("Paa", "Ti-il"));
        dictionary.put("Wound", new Translation("Sugat", "Pilas"));
        dictionary.put("Rice", new Translation("Kanin", "Kan-on"));
        dictionary.put("Wake", new Translation("Gising", "Bugtaw"));
        dictionary.put("When", new Translation("Kailan", "San-o"));
        dictionary.put("Where", new Translation("Saan", "Di-in"));
        dictionary.put("Care", new Translation("Ingat", "Halung"));
        dictionary.put("Many", new Translation("Marami", "Madamo"));
        dictionary.put("Needle", new Translation("Karayom", "Dagum"));
        dictionary.put("Thread", new Translation("Sinulid", "Hilo"));
        dictionary.put("Comb", new Translation("Suklay", "Husay"));
        dictionary.put("Pregnant", new Translation("Buntis", "Busong"));
        dictionary.put("Tamarind", new Translation("Sampaloc", "Sambag"));
        dictionary.put("Leave", new Translation("Iwan", "Ambot"));
        dictionary.put("Dream", new Translation("Pangarap", "Handom"));
        dictionary.put("Joyful", new Translation("Masayahin", "Malipayon"));
        dictionary.put("Basin", new Translation("Palanggana", "Labador"));
        dictionary.put("Bowl", new Translation("Mangkok", "Yahong"));
        dictionary.put("Laugh", new Translation("Tawa", "Kadlaw"));
        dictionary.put("Stroll", new Translation("Gala", "Lagaw"));
        dictionary.put("Sleepy", new Translation("Antok", "Tuyo"));
        dictionary.put("Twin", new Translation("Kambal", "Kapid"));
        dictionary.put("Fresh", new Translation("Sariwa", "Lab-as"));
        dictionary.put("Mushroom", new Translation("Kabute", "Uhong"));
        dictionary.put("Slippery", new Translation("Madulas", "Danlog"));
        dictionary.put("Cheap", new Translation("Mura", "Barato"));
        dictionary.put("Said", new Translation("Sabi", "Hambal"));
        dictionary.put("Know", new Translation("Marunong", ""));
        dictionary.put("Delicious", new Translation("Masarap", "Namit"));
        dictionary.put("Mango", new Translation("Mangga", "Paho"));
        dictionary.put("Smile", new Translation("Ngiti", "Yuhom"));
        dictionary.put("Loud", new Translation("Ingay", "Gahod"));
        dictionary.put("Breakfast", new Translation("Almusal", "Pamahaw"));
        dictionary.put("Dinner", new Translation("Hapunan", "Panyapon"));
        dictionary.put("Dust", new Translation("Alikabok", "Yab-ok"));
        dictionary.put("Drunk", new Translation("Lasing", "Hubog"));
        dictionary.put("Floor", new Translation("Sahig", "Salog"));
        dictionary.put("Work", new Translation("Trabaho", "Ubra"));
        dictionary.put("Fear", new Translation("Takot", "Hadlok"));
        dictionary.put("Stand", new Translation("Tayo", "Tindog")); //clarify
        dictionary.put("Move", new Translation("Urong", "Isdog"));
        dictionary.put("Sit", new Translation("Upo", "Pungko"));
        dictionary.put("Person", new Translation("Tao", "Tawo")); //10
        dictionary.put("Throw", new Translation("Tapon", "Haboy"));
        dictionary.put("", new Translation("Namasyal", "Naglagaw"));
        dictionary.put("Angry", new Translation("Galit", "Akig"));
        dictionary.put("Sweat", new Translation("Pawis", "Balhas"));
        dictionary.put("Old", new Translation("Matanda", "Tigulang"));
        dictionary.put("Fragrant", new Translation("Mabango", "Mahamot"));
        dictionary.put("Inside", new Translation("Loob", "Sulod"));
        dictionary.put("Eat", new Translation("Kain", "Ka-on"));
        dictionary.put("Long", new Translation("Matagal", "Dugay"));
        dictionary.put("Hiding", new Translation("Nagtatago", "Gapangago"));
        dictionary.put("Happy", new Translation("Masaya", "Kasadya"));
        dictionary.put("Sun", new Translation("Araw", "Adlaw"));
        dictionary.put("Monkey", new Translation("Unggoy", "Amu"));
        dictionary.put("House", new Translation("Bahay", "Balay"));
        dictionary.put("Bee", new Translation("Bubuyog", "Buyog"));
        dictionary.put("Lazy", new Translation("Tamad", "Tamaran"));
        dictionary.put("Brave", new Translation("Matapang", "Maisog"));
        dictionary.put("Industrious", new Translation("Masipag", "Mapisan"));
        dictionary.put("Helpful", new Translation("Matulungin", "Mabinuligon"));
        dictionary.put("Moody", new Translation("Sumpungin", "Alabuton"));
        dictionary.put("Walk", new Translation("Lakad", "Lakat"));
        dictionary.put("Easy", new Translation("Madali", "Hapos"));
        dictionary.put("Always", new Translation("Lagi", "Pirmi"));
        dictionary.put("", new Translation("Galawin", "")); //change
        dictionary.put("", new Translation("Pabili", "")); //change
        dictionary.put("", new Translation("Alagaan", "")); //change
        dictionary.put("", new Translation("Sinaing", "Tig-ang")); //change
        dictionary.put("", new Translation("", ""));
        dictionary.put("", new Translation("", ""));
        dictionary.put("", new Translation("", ""));
        dictionary.put("", new Translation("", ""));
        dictionary.put("", new Translation("", ""));
    }

    public Translation getTranslation(String word) {
        return dictionary.get(word);
    }
    
     public Set<Map.Entry<String, Translation>> entrySet() {
        return dictionary.entrySet();
    }
}
