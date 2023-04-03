public class ResourceLoaderService {
    public void showResourceData(){
        @Autowired
        ResourceLoader resourceLoader;
        Resource resource = resourceLoader.getResource("file:src/users.txt");
        InputStream inp = resource.getInputStream();
        File file = resource.getFile();
        System.out.println(file);

        ApplicationContext cont = new ClassPathXmlApplicationContext();
        Resource resource1 = cont.getResource("users.txt");
        System.out.println(resource1);

        ResourceLoaderService loader = (ResourceLoaderService);
        ctx.getBean("resourceLoaderService");
        loader.showResourceData();

    }
}
