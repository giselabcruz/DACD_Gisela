// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World! I am in DACD. I am taking some notes.");

        System.out.println("Special attention to the differences: Git is the tool to have control of the versions. " +
                "GitHub is a source code hosting platform that allows us to create local and remote repositories.");

        System.out.println("Take care with commits! We have to look for organization in our repository.");

        System.out.println("If we are in one layer that is not the latest committed, we have to look for a new branch.");

        System.out.println("We use the merge option to reintroduce changes we need in branches.");


        System.out.println("___________________________LAB CLASS 19/09/2023_____________________________");


        System.out.println("/Head/ is the tag that marks the current branch in which we are working.");

        System.out.println("When we have to commit, we're going to select the options 'Reformat Code' and 'Optimize Imports.' " +
                "We pay special attention to this to avoid unused imports.");

        System.out.println("We don't put comments; we write code that's explanatory enough so that comments are not needed." +
                " There are two acceptable comments: 'TODO,' which is important for leaving pending ideas so they are not lost, and colleagues can know where to continue." +
                "Additionally, 'FIXME' is also important; it is usually treated as a point of emphasis where special attention should be placed.");

        System.out.println("Encoding: The way bytes are grouped in a file is important because depending on it, you will know what type of data it refers to. UTF-8 is the most common."
                + "Pay special attention since there are files with different encodings. When working in a team, there will be people with different Windows, Mac...");

        System.out.println("Windows uses CRLF, a specific encoding for line breaks, which in this case consists of 2 characters. Git is not a fan of CRLF. There is another encoding called LF, which most developers use (LF - line feed, much simpler), except those who develop in .NET.");

        System.out.println("We use the Readme.md (md = markdown) for documentation. In the next practices, we must put the documentation there.");

        System.out.println("SOME COMMANDS: Commit, push (changes are sent to the cloud repository), pull (to incorporate changes that are in the cloud), clone (if there's a remote copy, I bring it to work locally ----> command line: git clone _repo_URL_).");

        System.out.println("The SSH protocol is more secure. SSH key for automatic authentication. We need to create a key in GitHub for authentication.");

        System.out.println("(Ctrl+Shift+A) helps us search for any element. (Ctrl+Shift+K) push shortcut;  Git --> Manage Remotes (to add to an already created repository). NEVER commit with syntax errors.");

        System.out.println("One branch tracks the other.");

        System.out.println("Gitflow methodology. We use the option 'Checkout' to change the branch we want.");


        System.out.println("_________________________CLASS 20/09/2023______TOOLS FOR DEVELOPMENT_________");

        System.out.println("Ascii, unicode(UTF-32), Unicode(UTF-8) 8 bytes, de forma que podemos representar diferentes" +
                " caracteres. UTF-16 o UTF-32 tratan carácteres como emojis. BOM a number at the start of a text stream" +
                "can signal several things, as the encoding we are using. En Java podemos seleccionar qué encoding necesitamos.");

        System.out.println("Existen metodologías que practican los desarrolladores(WORKFLOWS). FeatureBranch: se crea una rama nueva para implementar una caracteristica" +
                "nueva en un producto. Cuando termina esa feature, lo incorporan a las ramas de desarrollo." +
                "De esa manera, en la rama master se observará el desarrollo." + "Existe otra rama llamada Release: esta es intermedia, y los desarrolladores realizan diferentes testeos antes de sacarlo." +
                "Correción de errores para los dos primeros años de la salida del producto. Suele pasar que hay clientes que contratan evolución del proyecto, " +
                "por ello se crea una version intermedia llamada 'hotfix', para sacar una nueva versión a la rama master.");


        System.out.println("GIT COMMANDS: 'fetch' para ver las diferencias entre versiones. 'chechout' moverse entre ramas." +
                "'reset'.");

        System.out.println("Maven: gestor de codigo de proyectos, darle semantica, estructura y control junto con automatización del ciclo de vida." +
                "Cuando un proyecto lo mavenizamos, necesitamos 'pom.xml' y el directorio de fuentes, en test ponemos el codigo necesario para hacer testeo(TDD)." +
                "Los test deben ejecutarse de forma desatendida/automática. Cuando se utilizan diferentes lenguajes, con esta herramienta se pueden separar." +
                "A esta estructura se le llama 'arquetipo'. El '.xml' (extended marqued lang.). Dentro del pom.xml se definen las coordenadas de un artefacto. El output es un artefacto, resultado de la compilación y empaquetado de nuestro proyecto." +
                "'groupid'__nombre de la empresa, 'artifactid'" +
                "'jar' es la extension de los ficheros ejectutables de java. Es un comprimido de .zip que dentro tiene las clases compiladas. Esto es lo que se entrega a un cliente para que sea ejecutable." +
                "Las dependencias: en el fichero 'pom.xml' definimos de que depende: version, etc." +
                "Maven tiene su propio repositorio de artefactos donde se encuentran diferentes librerías, como para montar un servidor https, para hacer testing en librerías, para leer ficheros word, crear pdf's... " +
                "Project lifecycle: validate, compile, test, package(un jar), verify, install, deploy(distribuir, publicar  aun repositorio remoto)" +
                "Se genera un jar por cada modulo existente en el project.");


    }
}
