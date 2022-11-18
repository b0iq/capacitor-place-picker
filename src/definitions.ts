export interface PlacePickerPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
