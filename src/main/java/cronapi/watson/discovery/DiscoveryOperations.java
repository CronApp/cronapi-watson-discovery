package cronapi.watson.discovery;

import com.ibm.watson.developer_cloud.discovery.v1.Discovery;
import com.ibm.watson.developer_cloud.discovery.v1.model.*;
import cronapi.CronapiMetaData;

import java.util.Map;

@CronapiMetaData(categoryName = "Watson Discovery", categoryTags = {"Watson", "Discovery"})
public final class DiscoveryOperations {

  @CronapiMetaData(
      name = "{{createEnvironmentName}}",
      description = "{{createEnvironmentDescription}}"
  )
  public static Environment createEnvironment(String versionDate, String username, String password, String endPoint,
                                              Map<String, String> headers, CreateEnvironmentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createEnvironment(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteEnvironmentName}}",
      description = "{{deleteEnvironmentDescription}}"
  )
  public static void deleteEnvironment(String versionDate, String username, String password, String endPoint,
                                       Map<String, String> headers, DeleteEnvironmentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteEnvironment(options).execute();
  }

  @CronapiMetaData(
      name = "{{getEnvironmentName}}",
      description = "{{getEnvironmentDescription}}"
  )
  public static Environment getEnvironment(String versionDate, String username, String password, String endPoint,
                                           Map<String, String> headers, GetEnvironmentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getEnvironment(options).execute();
  }

  @CronapiMetaData(
      name = "{{listEnvironmentsName}}",
      description = "{{listEnvironmentsDescription}}"
  )
  public static ListEnvironmentsResponse listEnvironments(String versionDate, String username, String password,
                                                          String endPoint, Map<String, String> headers,
                                                          ListEnvironmentsOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listEnvironments(options).execute();
  }

  @CronapiMetaData(
      name = "{{listFieldsName}}",
      description = "{{listFieldsDescription}}"
  )
  public static ListCollectionFieldsResponse listFields(String versionDate, String username, String password,
                                                        String endPoint, Map<String, String> headers,
                                                        ListFieldsOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listFields(options).execute();
  }

  @CronapiMetaData(
      name = "{{updateEnvironmentName}}",
      description = "{{updateEnvironmentDescription}}"
  )
  public static Environment updateEnvironment(String versionDate, String username, String password,
                                              String endPoint, Map<String, String> headers,
                                              UpdateEnvironmentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateEnvironment(options).execute();
  }

  @CronapiMetaData(
      name = "{{createConfigurationName}}",
      description = "{{createConfigurationDescription}}"
  )
  public static Configuration createConfiguration(String versionDate, String username, String password,
                                                  String endPoint, Map<String, String> headers,
                                                  CreateConfigurationOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createConfiguration(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteConfigurationName}}",
      description = "{{deleteConfigurationDescription}}"
  )
  public static Void deleteConfiguration(String versionDate, String username, String password,
                                         String endPoint, Map<String, String> headers, DeleteConfigurationOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteConfiguration(options).execute();
  }

  @CronapiMetaData(
      name = "{{getConfigurationName}}",
      description = "{{getConfigurationDescription}}"
  )
  public static Configuration getConfiguration(String versionDate, String username, String password,
                                               String endPoint, Map<String, String> headers,
                                               GetConfigurationOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getConfiguration(options).execute();
  }

  @CronapiMetaData(
      name = "{{listConfigurationsName}}",
      description = "{{listConfigurationsDescription}}"
  )
  public static ListConfigurationsResponse listConfigurations(String versionDate, String username, String password,
                                                              String endPoint, Map<String, String> headers,
                                                              ListConfigurationsOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listConfigurations(options).execute();
  }

  @CronapiMetaData(
      name = "{{updateConfigurationName}}",
      description = "{{updateConfigurationDescription}}"
  )
  public static Configuration updateConfiguration(String versionDate, String username, String password,
                                                  String endPoint, Map<String, String> headers,
                                                  UpdateConfigurationOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateConfiguration(options).execute();
  }

  @CronapiMetaData(
      name = "{{testConfigurationInEnvironmentName}}",
      description = "{{testConfigurationInEnvironmentDescription}}"
  )
  public static TestDocument testConfigurationInEnvironment(String versionDate, String username, String password,
                                                            String endPoint, Map<String, String> headers,
                                                            TestConfigurationInEnvironmentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.testConfigurationInEnvironment(options).execute();
  }

  @CronapiMetaData(
      name = "{{createCollectionName}}",
      description = "{{createCollectionDescription}}"
  )
  public static Collection createCollection(String versionDate, String username, String password,
                                            String endPoint, Map<String, String> headers,
                                            CreateCollectionOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createCollection(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteCollectionName}}",
      description = "{{deleteCollectionDescription}}"
  )
  public static Void deleteCollection(String versionDate, String username, String password,
                                      String endPoint, Map<String, String> headers, DeleteCollectionOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteCollection(options).execute();
  }

  @CronapiMetaData(
      name = "{{getCollectionName}}",
      description = "{{getCollectionDescription}}"
  )
  public static Collection getCollection(String versionDate, String username, String password,
                                         String endPoint, Map<String, String> headers, GetCollectionOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getCollection(options).execute();
  }

  @CronapiMetaData(
      name = "{{listCollectionFieldsName}}",
      description = "{{listCollectionFieldsDescription}}"
  )
  public static ListCollectionFieldsResponse listCollectionFields(String versionDate, String username, String password,
                                                                  String endPoint, Map<String, String> headers,
                                                                  ListCollectionFieldsOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listCollectionFields(options).execute();
  }

  @CronapiMetaData(
      name = "{{listCollectionsFieldsName}}",
      description = "{{listCollectionsFieldsDescription}}"
  )
  public static ListCollectionsResponse listCollections(String versionDate, String username, String password,
                                                        String endPoint, Map<String, String> headers,
                                                        ListCollectionsOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listCollections(options).execute();
  }

  @CronapiMetaData(
      name = "{{updateCollectionName}}",
      description = "{{updateCollectionDescription}}"
  )
  public static Collection updateCollection(String versionDate, String username, String password,
                                            String endPoint, Map<String, String> headers,
                                            UpdateCollectionOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateCollection(options).execute();
  }

  @CronapiMetaData(
      name = "{{addDocumentName}}",
      description = "{{addDocumentDescription}}"
  )
  public static DocumentAccepted addDocument(String versionDate, String username, String password, String endPoint,
                                             Map<String, String> headers, AddDocumentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.addDocument(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteDocumentName}}",
      description = "{{deleteDocumentDescription}}"
  )
  public static Void deleteDocument(String versionDate, String username, String password, String endPoint,
                                    Map<String, String> headers, DeleteDocumentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteDocument(options).execute();
  }

  @CronapiMetaData(
      name = "{{getDocumentStatusName}}",
      description = "{{getDocumentStatusDescription}}"
  )
  public static DocumentStatus getDocumentStatus(String versionDate, String username, String password, String endPoint,
                                                 Map<String, String> headers, GetDocumentStatusOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getDocumentStatus(options).execute();
  }

  @CronapiMetaData(
      name = "{{updateDocumentName}}",
      description = "{{updateDocumentDescription}}"
  )
  public static DocumentAccepted updateDocument(String versionDate, String username, String password, String endPoint,
                                                Map<String, String> headers, UpdateDocumentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateDocument(options).execute();
  }

  @CronapiMetaData(
      name = "{{federatedQueryName}}",
      description = "{{federatedQueryDescription}}"
  )
  public static QueryResponse federatedQuery(String versionDate, String username, String password, String endPoint,
                                             Map<String, String> headers, FederatedQueryOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);
    return service.federatedQuery(options).execute();
  }

  @CronapiMetaData(
      name = "{{federatedQueryNoticesName}}",
      description = "{{federatedQueryNoticesDescription}}"
  )
  public static QueryNoticesResponse federatedQueryNotices(String versionDate, String username, String password,
                                                           String endPoint, Map<String, String> headers,
                                                           FederatedQueryNoticesOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.federatedQueryNotices(options).execute();
  }

  @CronapiMetaData(
      name = "{{queryNoticesName}}",
      description = "{{queryDescription}}"
  )
  public static QueryResponse query(String versionDate, String username, String password,
                                    String endPoint, Map<String, String> headers, QueryOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.query(options).execute();
  }

  @CronapiMetaData(
      name = "{{queryEntitiesName}}",
      description = "{{queryEntitiesDescription}}"
  )
  public static QueryEntitiesResponse queryEntities(String versionDate, String username, String password,
                                                    String endPoint, Map<String, String> headers,
                                                    QueryEntitiesOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.queryEntities(options).execute();
  }

  @CronapiMetaData(
      name = "{{queryNoticesName}}",
      description = "{{queryNoticesDescription}}"
  )
  public static QueryNoticesResponse queryNotices(String versionDate, String username, String password,
                                                  String endPoint, Map<String, String> headers,
                                                  QueryNoticesOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.queryNotices(options).execute();
  }

  @CronapiMetaData(
      name = "{{queryRelationsName}}",
      description = "{{queryRelationsDescription}}"
  )
  public static QueryRelationsResponse queryRelations(String versionDate, String username, String password,
                                                      String endPoint, Map<String, String> headers,
                                                      QueryRelationsOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.queryRelations(options).execute();
  }

  @CronapiMetaData(
      name = "{{addTrainingDataName}}",
      description = "{{addTrainingDataDescription}}"
  )
  public static TrainingQuery addTrainingData(String versionDate, String username, String password,
                                              String endPoint, Map<String, String> headers,
                                              AddTrainingDataOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.addTrainingData(options).execute();
  }

  @CronapiMetaData(
      name = "{{createTrainingExampleName}}",
      description = "{{createTrainingExampleDescription}}"
  )
  public static TrainingExample createTrainingExample(String versionDate, String username, String password,
                                                      String endPoint, Map<String, String> headers,
                                                      CreateTrainingExampleOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createTrainingExample(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteAllTrainingDataName}}",
      description = "{{deleteAllTrainingDataDescription}}"
  )
  public static Void deleteAllTrainingData(String versionDate, String username, String password,
                                           String endPoint, Map<String, String> headers,
                                           DeleteAllTrainingDataOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteAllTrainingData(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteTrainingDataName}}",
      description = "{{deleteTrainingDataDescription}}"
  )
  public static Void deleteTrainingData(String versionDate, String username, String password,
                                        String endPoint, Map<String, String> headers,
                                        DeleteTrainingDataOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteTrainingData(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteTrainingExampleName}}",
      description = "{{deleteTrainingExampleDescription}}"
  )
  public static Void deleteTrainingExample(String versionDate, String username, String password,
                                           String endPoint, Map<String, String> headers,
                                           DeleteTrainingExampleOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteTrainingExample(options).execute();
  }

  @CronapiMetaData(
      name = "{{getTrainingDataName}}",
      description = "{{getTrainingDataDescription}}"
  )
  public static TrainingQuery getTrainingData(String versionDate, String username, String password,
                                              String endPoint, Map<String, String> headers,
                                              GetTrainingDataOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getTrainingData(options).execute();
  }

  @CronapiMetaData(
      name = "{{getTrainingExampleName}}",
      description = "{{getTrainingExampleDescription}}"
  )
  public static TrainingExample getTrainingExample(String versionDate, String username, String password,
                                                   String endPoint, Map<String, String> headers,
                                                   GetTrainingExampleOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getTrainingExample(options).execute();
  }

  @CronapiMetaData(
      name = "{{listTrainingDataName}}",
      description = "{{listTrainingDataDescription}}"
  )
  public static TrainingDataSet listTrainingData(String versionDate, String username, String password,
                                                 String endPoint, Map<String, String> headers,
                                                 ListTrainingDataOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listTrainingData(options).execute();
  }

  @CronapiMetaData(
      name = "{{listTrainingExamplesName}}",
      description = "{{listTrainingExamplesDescription}}"
  )
  public static TrainingExampleList listTrainingExamples(String versionDate, String username, String password,
                                                         String endPoint, Map<String, String> headers,
                                                         ListTrainingExamplesOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listTrainingExamples(options).execute();
  }

  @CronapiMetaData(
      name = "{{updateTrainingExampleName}}",
      description = "{{updateTrainingExampleDescription}}"
  )
  public static TrainingExample updateTrainingExample(String versionDate, String username, String password,
                                                      String endPoint, Map<String, String> headers,
                                                      UpdateTrainingExampleOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateTrainingExample(options).execute();
  }
}
