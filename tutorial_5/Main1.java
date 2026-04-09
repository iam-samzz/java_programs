interface VoiceAssistant {
    void respond();
}

interface ChatAssistant {
    void respond();
}

class SmartAssistant implements VoiceAssistant, ChatAssistant {
    public void respond() {
        System.out.println("Responding as both voice and chat assistant");
    }
}

public class Main1 {
    public static void main(String[] args) {
        SmartAssistant sa = new SmartAssistant();
        sa.respond();
    }
}