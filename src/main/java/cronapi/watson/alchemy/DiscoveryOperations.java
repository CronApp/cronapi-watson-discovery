package cronapi.watson.alchemy;

import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.CombinedResults;
import com.ibm.watson.developer_cloud.alchemy.v1.model.DocumentAuthors;
import com.ibm.watson.developer_cloud.alchemy.v1.model.LanguageSelection;
import cronapi.CronapiMetaData;

import java.util.Map;

@CronapiMetaData(categoryName = "Watson Alchemy Language", categoryTags = { "Watson", "Alchemy", "Language" })
public final class AlchemyLanguageOperations {
    @CronapiMetaData(
            name = "{{getCombinedResultsName}}",
            nameTags = { "getCombinedResults" },
            description = "{{getCombinedResultsDescription}}"
    )
    public static CombinedResults getCombinedResults(String apiKey, LanguageSelection language, Map<String, Object> params,
                                                     Map<String, String> headers) {

        AlchemyLanguage service = new AlchemyLanguage();
        service.setApiKey(apiKey);
        service.setLanguage(language);
        service.setDefaultHeaders(headers);
        return service.getCombinedResults(params).execute();
    }

    @CronapiMetaData(
            name = "{{getCombinedResultsName}}",
            nameTags = { "getCombinedResults" },
            description = "{{getCombinedResultsDescription}}"
    )
    public static DocumentAuthors getAuthors(String apiKey, LanguageSelection language, Map<String, Object> params,
                                                     Map<String, String> headers) {

        AlchemyLanguage service = new AlchemyLanguage();
        service.setApiKey(apiKey);
        service.setLanguage(language);
        service.setDefaultHeaders(headers);
        return service.getAuthors(params).execute();
    }
}
