package de.bybackfish.api.skyblock.skills;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PlayerSkills {

  @SerializedName(
      "combat"
  )
  private PlayerSkill combat = new PlayerSkill();

  @SerializedName(
      "foraging"
  )
  private PlayerSkill foraging = new PlayerSkill();

  @SerializedName(
      "mining"
  )
  private PlayerSkill mining = new PlayerSkill();

  @SerializedName(
      "enchanting"
  )
  private PlayerSkill enchanting = new PlayerSkill();

  @SerializedName(
      "farming"
  )
  private PlayerSkill farming = new PlayerSkill();

  @SerializedName(
      "fishing"
  )
  private PlayerSkill fishing = new PlayerSkill();

  @SerializedName(
      "alchemy"
  )
  private PlayerSkill alchemy = new PlayerSkill();

  @SerializedName(
      "taming"
  )
  private PlayerSkill taming = new PlayerSkill();

  @SerializedName(
      "runecrafting"
  )
  private PlayerSkill runecrafting = new PlayerSkill();

  @SerializedName(
      "carpentry"
  )
  private PlayerSkill carpentry = new PlayerSkill();

  @SerializedName(
      "average"
  )
  private double average = 0;

  @SerializedName(
      "trueAverage"
  )
  private double trueAverage = 0;


}
