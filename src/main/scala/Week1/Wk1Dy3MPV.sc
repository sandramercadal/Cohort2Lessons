//MVP
//Watermelon exercise
val waterermelonTotal : Int 5

if (ageRating >= 18) {
  s"Your $ageRating means you can see a film rated 18"
} else if (ageRating>= 15) {
  s"Your $ageRating can see a film rated 15"
} else if (ageRating >= 12) {
  s"Your $ageRating can see a film rated 12A"
} else if (ageRating >= 8) {
  s"Your $ageRating  can see a film rated PG"
} else if (ageRating >= 4) {
  s"Your $ageRating can see a film rated U"
} else {
  s"Your $ageRating mean are too young  - sorry"
}
calculateWatermelons() {
  const watermelons = parseInt(document.getElementById('watermelons').value);
  let result = '';

  if (isNaN(watermelons) || watermelons < 0) {
    result = "Please enter a valid number of watermelons (0 or more).";
  } else {
    if (watermelons < 3) {
      result = John can carry ${watermelons} watermelons without a bag, but he can use a bag to carry ${watermelons + 2} watermelons.;
    } else if (watermelons <= 5) {
      result = John can carry ${watermelons} watermelons and he can use a bag. Total capacity with a bag: ${watermelons + 2} watermelons.;
    } else {
      result = John can carry 5 watermelons without a bag, and cannot use a bag. Total: ${watermelons} watermelons (exceeding capacity).;
    }
  }