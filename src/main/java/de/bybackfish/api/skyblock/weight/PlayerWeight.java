package de.bybackfish.api.skyblock.weight;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;

@Getter
public class PlayerWeight {

  @SerializedName("weight")
  private double weight;

  @SerializedName("overflow")
  private double overflow;

}
