import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({
        "name",
        "number",
        "grade"
})
public class Member {
    @JsonProperty("name")
    private String name;
    @JsonProperty("grade")
    private String grade;
    @JsonProperty("number")
    private String number;
    Counter counter = new Counter();

    @Override
    public String toString(){
        return grade+name;
    }

    /**
     * 研究室メンバーをセットします
     * @param name 名前
     * @param number t_device_mng_id
     * @param grade 学年(統一されていれば何でもoK)
     */
    public Member(String name, String number, String grade){
        this.counter = new Counter();
        this.name = name;
        this.grade = grade;
        this.number = number;

    }

    public Member(){}




}
