import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.IOException;

//アノテーションでcsvの順序とキー名を対応させています
@JsonIgnoreProperties(ignoreUnknown=true)
@Data
@JsonPropertyOrder({
        "登録日時",
        "形態",
        "ヘッドライン",
        "APNs:送信数",
        "APNs:成功",
        "APNs:失敗",
        "GCM:送信数",
        "GCM:成功",
        "GCM:失敗",
        "sender",
        "user",
        "root_push_id",
        "既読状態"
})
public class Message {
    @JsonProperty("登録日時")
    private String createdDate;
    @JsonProperty("形態")
    private String type;
    @JsonProperty("ヘッドライン")
    private String headline;
    @JsonProperty("APNs:送信数")
    private String APNsSend;
    @JsonProperty("APNs:成功")
    private String APNsSuccess;
    @JsonProperty("APNs:失敗")
    private String APNsFail;
    @JsonProperty("GCM:送信数")
    private String GCMSend;
    @JsonProperty("GCM:成功")
    private String GCMSuccess;
    @JsonProperty("GCM:失敗")
    private String GCMFail;
    @JsonProperty("sender")
    private String sender;
    @JsonProperty("user")
    private String user;
    @JsonProperty("root_push_id")
    private String root_push_id;
    @JsonProperty("既読状態")
    private String readCondition;
    @JsonIgnore
    private String read_count;
    @JsonIgnore
    private String receive_count;

    public Message(){}

    public Message(
            String createdDate,
            String type,
            String headline,
            String APNsSend,
            String APNsSuccess,
            String APNsFail,
            String GCMSend,
            String GCMSuccess,
            String GCMFail,
            String sender,
            String user,
            String root_push_id,
            String readCondition
    ) throws IOException {
        this.createdDate = createdDate;
        this.type = type;
        this.headline = headline;
        this.APNsSend = APNsSend;
        this.APNsSuccess = APNsSuccess;
        this.APNsFail = APNsFail;
        this.GCMSend = GCMSend;
        this.GCMSuccess = GCMSuccess;
        this.GCMFail = GCMFail;
        this.sender = sender;
        this.createdDate = createdDate;
        this.user = user;
        this.root_push_id = root_push_id;
        this.readCondition = readCondition;

    }

}
