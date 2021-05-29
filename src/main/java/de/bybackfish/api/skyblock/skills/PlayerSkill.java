package de.bybackfish.api.skyblock.skills;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;

@Getter
public class PlayerSkill {
  @SerializedName("xp")
  private double xp = 0;

  @SerializedName("level")
  private double level = 0;

  @SerializedName("progress")
  private double progress = 0;

  @SerializedName("required")
  private double required = 0;

  @SerializedName("into")
  private double into = 0;
}
