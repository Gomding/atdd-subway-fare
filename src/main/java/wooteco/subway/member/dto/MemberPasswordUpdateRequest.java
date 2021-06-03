package wooteco.subway.member.dto;

import javax.validation.constraints.NotBlank;

public class MemberPasswordUpdateRequest {
    @NotBlank(message = "입력되지 않은 항목을 확인해주세요")
    private String currentPassword;

    @NotBlank(message = "입력되지 않은 항목을 확인해주세요")
    private String newPassword;

    public MemberPasswordUpdateRequest() {
    }

    public MemberPasswordUpdateRequest(String currentPassword, String newPassword) {
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }
}
