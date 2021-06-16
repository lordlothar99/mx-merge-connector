// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package merge.actions;

import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class MergeLink extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __configuration;
	private merge.proxies.MergeConfiguration configuration;

	public MergeLink(IContext context, IMendixObject configuration)
	{
		super(context);
		this.__configuration = configuration;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.configuration = __configuration == null ? null : merge.proxies.MergeConfiguration.initialize(getContext(), __configuration);

		// BEGIN USER CODE
		String linkToken = createLinkToken();
		return linkToken;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "MergeLink";
	}

	// BEGIN EXTRA CODE

	/**
	 * @see "https://www.merge.dev/docs/linking-flow/get-started"
	 */
	private String createLinkToken()
            throws IOException, InterruptedException, CoreException {

        Map<Object, Object> data = new HashMap();
        data.put("end_user_origin_id", this.configuration.getOrganizationId());             // unique entity ID
        data.put("end_user_organization_name", this.configuration.getOrganizationName());   // your user's organization name
        data.put("end_user_email_address", this.configuration.getEmailAddress());           // your user's email address
        String[] categories = this.configuration.getMergeConfiguration_Category().stream()
				.map(c -> c.getName().getCaption())
				.toArray(String[]::new);
        data.put("categories", categories);
        if (this.configuration.getIntegration() != null && !"".equals(this.configuration.getIntegration().trim())) {
			data.put("integration", this.configuration.getIntegration());
		}
        ObjectMapper mapper = new ObjectMapper();
        String requestBody = mapper.writeValueAsString(data);

        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create("https://api.merge.dev/api/integrations/create-link-token");
        HttpRequest request = HttpRequest.newBuilder(uri)
                .header("Content-Type", "application/json")
                .header("Authorization", String.format("Bearer %s", this.configuration.getAPIKey()))
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> linkTokenResult = client.send(request, HttpResponse.BodyHandlers.ofString());
        String linkToken = new ObjectMapper().readValue(linkTokenResult.body(), ObjectNode.class).get("link_token").textValue();
        return linkToken;
    }
	// END EXTRA CODE
}
