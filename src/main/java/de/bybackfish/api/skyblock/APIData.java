package de.bybackfish.api.skyblock;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class APIData {
  @SerializedName("success")
  private boolean success;

  @SerializedName("data")
  private PlayerData playerData;

}
