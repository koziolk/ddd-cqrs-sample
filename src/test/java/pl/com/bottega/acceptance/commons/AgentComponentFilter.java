package pl.com.bottega.acceptance.commons;


public class AgentComponentFilter  {
/*
    private static enum Agent {
        BROWSER(BrowserAgent.class), REMOTE(RemoteAgent.class);

        private final String annotationClass;

        private Agent(Class<?> annotationClass) {
            this.annotationClass = annotationClass.getName();
        }
    }

    private static final Agent DEFAULT = Agent.BROWSER;
    private static final String SYSTEM_PROPERTY = "useAgent";

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        String agentAnnotation = getSelectedAgent().annotationClass;
        Set<String> presentAnnotations = metadataReader.getAnnotationMetadata().getAnnotationTypes();
        return presentAnnotations.contains(agentAnnotation);
    }

    private Agent getSelectedAgent() {
        String agent = System.getProperty(SYSTEM_PROPERTY);
        try {
            return Agent.valueOf(agent.toUpperCase());
        } catch (Exception e) {
            return DEFAULT;
        }
    }*/
}
