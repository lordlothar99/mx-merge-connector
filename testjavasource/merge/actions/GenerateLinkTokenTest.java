package merge.actions;

public class GenerateLinkTokenTest {

    public static void main(String[] args) throws Exception {
        String linkToken = GenerateLinkToken.createLinkToken("1", "Kohomai", "francois@kohomai.com",
                true, true, true, null, "AlclPNvGh1fcdjcmyEUuwi3Y-MG2il4yjbTy0bXtAbAtpJmB5f6XsA");
        System.out.println("Link token : " + linkToken);
    }
}
