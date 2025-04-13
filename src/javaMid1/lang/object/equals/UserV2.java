package javaMid1.lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String userId;

    public UserV2(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(userId, userV2.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }
}
