package de.bybackfish.api.skyblock.dungeons;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PlayerDungeonCompletions {

  @SerializedName("floor_7")
  private long floor7;

  @SerializedName("floor_6")
  private long floor6;

  @SerializedName("floor_5")
  private long floor5;

  @SerializedName("floor_4")
  private long floor4;

  @SerializedName("floor_3")
  private long floor3;

  @SerializedName("floor_2")
  private long floor2;

  @SerializedName("floor_1")
  private long floor1;

  @SerializedName("floor_0")
  private long floor0;

  @SerializedName("master_6")
  private long master6;

  @SerializedName("master_5")
  private long master5;

  @SerializedName("master_4")
  private long master4;

  @SerializedName("master_3")
  private long master3;

  @SerializedName("master_2")
  private long master2;

  @SerializedName("master_1")
  private long master1;

}
