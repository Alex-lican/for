
 private static enum Singleton{
        INSTANCE;
        private EnumSingleton singleton;
        private Singleton(){
            singleton = new EnumSingleton();
        }
        public EnumSingleton getInstance(){
            return singleton;
        }
