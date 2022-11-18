import { WebPlugin } from '@capacitor/core';

import type {
  PlacePickerOptions,
  PlacePickerPlugin,
  PlacePickerResults,
} from './definitions';

export class PlacePickerWeb extends WebPlugin implements PlacePickerPlugin {
  async pickPlace(options: PlacePickerOptions): Promise<PlacePickerResults> {
    return {} as any;
  }
}
