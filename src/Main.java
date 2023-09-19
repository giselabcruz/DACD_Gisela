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


        System.out.println("___________________________LAB CLASS_____________________________");


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

        System.out.println("Gitflow metodology. We use the option 'Checkout' to change the branch we want.");

    }
}
